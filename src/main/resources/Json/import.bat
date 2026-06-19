@echo off
for %%f in (*.json) do (
    "mongoimport.exe" --db Farmacia --collection Ventas --file %%~nf.json
)