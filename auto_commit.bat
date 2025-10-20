@echo off
REM Cambiá la ruta a la carpeta de tu proyecto
cd /d "C:\Users\Thiago\Desktop\Trabajos Practicos - Prog 2"

REM Fecha y hora actuales
set datetime=%date% %time%

REM Hacer commit automático
git add -A
git commit -m "Auto commit diario - %datetime%"
git push origin main

echo Commit automático hecho a las %datetime%
pause
