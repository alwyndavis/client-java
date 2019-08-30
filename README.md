
### Instaclustr-grafeas-client fork

This is a fork and a modified version of the grafeas client for JAVA. The repository contains the code and the swagger-file reqired for builing a java client for the V1beta1 version of grafeas.

It has some changes to the one found in grafeas/grafeas/proto/v1beta1, for instance the endopoints genrated using swagger-code gen for the aforementioned doesn't seem to work correctly for certain endpoints. Also, serialization using snake_casing is changed to camelCasing for consistent deserialization while querying from grafeas.

To modify and generate the source code, modify the swagger/grafeas.json file, install swagger-code gen in your system and run

    swagger-codegen generate -i swagger/grafeas.json -l java -o instaclustr-client-java

This will generate the java client for grafeas, which you can use as a library in your grafeas project.

Also, an S3 bucket is used to deploy the generated jar to. To configure it and successfully upload the jar, update the properties in both pom.xml and settings.xml and execute

    mvn --settings settings.xml clean deploy

