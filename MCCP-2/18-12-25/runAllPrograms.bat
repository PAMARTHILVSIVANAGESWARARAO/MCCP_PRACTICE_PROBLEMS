@echo off
cls

echo ===============================
echo Compiling all Java files
echo ===============================
javac Problem1.java Problem2.java Problem3.java Problem4.java Problem5.java Problem6.java Problem7.java Problem8.java Problem9.java Problem10.java Problem11.java Problem12.java Problem13.java Problem14.java Problem15.java Problem16.java Problem17.java Problem18.java Problem19.java Problem20.java Problem21.java

if %errorlevel% neq 0 (
    echo Compilation failed
    pause
    exit /b
)

echo.
echo ===============================
echo Running all programs
echo ===============================
echo.

java Problem1
echo.
java Problem2
echo.
java Problem3
echo.
java Problem4
echo.
java Problem5
echo.
java Problem6
echo.
java Problem7
echo.
java Problem8
echo.
java Problem9
echo.
java Problem10
echo.
java Problem11
echo.
java Problem12
echo.
java Problem13
echo.
java Problem14
echo.
java Problem15
echo.
java Problem16
echo.
java Problem17
echo.
java Problem18
echo.
java Problem19
echo.
java Problem20
echo.
java Problem21

echo.
echo ===============================
echo All programs executed
echo ===============================
pause
