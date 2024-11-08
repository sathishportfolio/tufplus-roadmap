$currentDate = Get-Date
$startDate = $currentDate.AddYears(-1)

Get-ChildItem -Recurse -File | ForEach-Object {
    $randomDays = Get-Random -Minimum 0 -Maximum ($currentDate - $startDate).Days
    $newDate = $currentDate.AddDays(-$randomDays)
    $_.LastWriteTime = $newDate
    Write-Host "Updated $($_.FullName) to $($newDate.ToString('dd/MMM/yyyy'))"
}

Write-Host "File modification dates have been randomly updated."


# Get all files in the current directory and subdirectories
$files = Get-ChildItem -Recurse -File

# Create a hashtable to store files grouped by date
$filesByDate = @{}

foreach ($file in $files) {
    $dateKey = $file.LastWriteTime.ToString("dd/MMM/yyyy")
    $relativePath = $file.FullName.Substring($PWD.Path.Length).TrimStart("\")
    
    if (-not $filesByDate.ContainsKey($dateKey)) {
        $filesByDate[$dateKey] = @()
    }
    
    $filesByDate[$dateKey] += $relativePath
}

# Sort the hashtable by date (most recent first)
$sortedFilesByDate = [ordered]@{}
$filesByDate.GetEnumerator() | Sort-Object {[datetime]::ParseExact($_.Key, "dd/MMM/yyyy", $null)} -Descending | ForEach-Object {
    $sortedFilesByDate[$_.Key] = $_.Value
}

# Convert the hashtable to JSON
$json = ConvertTo-Json -InputObject $sortedFilesByDate -Depth 3

# Save the JSON to a file
$json | Set-Content -Path "file_list_by_date.json" -Encoding UTF8

Write-Host "File list JSON has been created as 'file_list_by_date.json' in the current directory."
