Compile:
javac -classpath "./lib/*" EnviarCorreo.java

Execute:
java -cp ".:lib/javax.mail.jar" EnviarCorreo

Build JAR:
jar cfm EnviarCorreo.jar MANIFEST.txt EnviarCorreo.class