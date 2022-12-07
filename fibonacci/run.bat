@echo off

if "%1" == "/c" (
    call :compile_java
)

if exist bin\ (
    call :run_java
) else (
    call :compile_java
    call :run_java
)
exit /B %ERRORLEVEL%

:compile_java
echo compiling...
dir /s /B src\*.java > sources.txt
javac -d bin @sources.txt
del sources.txt
exit /B 0

:run_java
echo running...
java -cp bin xyz.dmfe.fib.FibRunner
exit /B 0
