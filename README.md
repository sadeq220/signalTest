there is compiled class on master branch ,first you must on linux since windows dosn't have SIGTERM , you can easily run it by

### $java Test

absolutely you must have JRE 11 installed ,
this program will first print it's own PID ,
you should use this PID for $kill in another shell as:
### $kill -s TERM {PID}
you can execute this snippet many times and on every one see exception raising ,
then you can see this SIG will cause exception in our software but ,
we handle it properly and program will not terminated ,
eventually for get rid of a running software :

### $kill -s KILL {PID}

and you can see codes on 'undev' branch .
