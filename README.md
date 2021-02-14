# Logging i Java #

## 0. git-repo ##

Utgangspunktet er et grunnleggende git-repo med kun en README. Første oppgave er å lage en enkel 'Hallo Verden'-applikasjon i Java.

## 1. Hallo Verden ##

En enkel klasse 'Hallo.java' i src/org/larma som skriver 'Hallo, hallo, Verden!' ved kjøring. 

* javac org/larma/Hallo.java 
* java org.larma.Hallo

.gitignore for å skjule *.class-filer

Neste oppgave er å lage byggeskript

## 2. Byggeskript ##

Lagt på tre byggeskript:

* c - kompilerer koden
* r - kjører koden
* clean - rydder opp

Neste oppgave er å bruke SLF4J til å logge
