FROM openjdk:8-jre
MAINTAINER Nikhil Sharma <nikhil2489@gmail.com>


ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/retailmart.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
#ADD target/lib           /usr/share/myservice/lib
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/myservice/retailmart.jar