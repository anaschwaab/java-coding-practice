@echo off
setlocal
set "SOURCE_DIR=src"
set "OUTPUT_DIR=bin"

if exist "%OUTPUT_DIR%" rd /s /q "%OUTPUT_DIR%"
mkdir "%OUTPUT_DIR%"

for /r "%SOURCE_DIR%" %%f in (*.java) do (
    echo Compiling %%f
    javac -d "%OUTPUT_DIR%" "%%f"
)

endlocal
