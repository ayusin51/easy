 # mvn -B -DdryRun=true clean install -Dtag=0.0.1 release:prepare release:perform deploy -P release
 # mvn -B clean install -Dtag=0.0.16 release:prepare release:perform deploy -P release
 mvn -B clean install -DskipTests -Dtag=0.0.23 release:prepare release:perform -P release
