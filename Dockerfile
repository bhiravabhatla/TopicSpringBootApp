FROM maven

COPY   pom.xml /.

RUN ["mvn", "clean", "install"]

CMD ["/bin/bash"]