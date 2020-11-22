FROM amazoncorretto:8

RUN curl https://bintray.com/sbt/rpm/rpm | tee /etc/yum.repos.d/bintray-sbt-rpm.repo && \
 yum install -y sbt git epel-release sudo make gcc-c++ && \
 curl -sL https://rpm.nodesource.com/setup_8.x | sudo bash - && \
 curl -sL https://dl.yarnpkg.com/rpm/yarn.repo | tee /etc/yum.repos.d/yarn.repo && \
 rpm --import https://dl.yarnpkg.com/rpm/pubkey.gpg && \
 yum -y install nodejs yarn

WORKDIR /app

ENTRYPOINT ["sbt"]
CMD ["--help"]
