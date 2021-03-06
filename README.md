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

## 3. SLF4J ##

Nytt skript for å hente ned avhengighet slf4j-api: cplibs

Oppdatert Hallo.java til å instansiere Logger via LoggerFactory og logge en melding ved oppstart.

Oppdatert byggeskript c og r til å inkludere lib-katalogen i CLASSPATH

Neste oppgave er å introdusere en implementasjon 

## 4. Logback ##

Oppdatert cplibs med to nye avhengigheter:

* logback-core - implementasjon av logging
* logback-classic - lim mellom slf4j og logback-core

Neste oppgave er å logge til fil

## 5. Log til fil ##

Opprettet logback.xml i /res

Oppdatert r til å includere res i CLASSPATH

.gitignore oppdatert for å ignorere logs/

Neste oppgave er å logge error til egen fil


## 6. Egen error log ##

Definerer ny appender 'ALVORLIG' i logback.xml.
Passer på at root-logger refererer til denne

Neste oppgave er å lage egen logfil for egen Hallo-klassen


## 7. Egen klasse, egen fil ##

Definerer opp ny klasse Egen med egen logger

Definerer egen logger i logback.xml for Egen.

egen-logger skriver til hallo.log
root-logger skriver til error.log

Oppdatert c til å kompilere alle java-filer