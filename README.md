# Buddy-System-Maven

Para ejecutar casos de prueba y obtener reporte de coverage (se debe tener maven instalado):

mvn install

mvn clean jacoco:prepare-agent install jacoco:report

Esto generarĂ¡ una carpeta target que a su vez contendrĂ¡ una carpeta jacoco y esta un archivo index.html que lleva a el reporte.
