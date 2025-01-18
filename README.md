# spring-boot-mongock-sample

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-mongock-sample.git`
2. Navigate to the folder: `cd spring-boot-mongock-sample`
3. Make sure your docker is UP n RUNNING
4. Run the application: `mvn clean spring-boot:run`
5. Open your favorite browser: http://localhost:8080/api/customers
6. Check your console log

```json
// 20250119060234
// http://localhost:8080/api/customers

// 20250119061735
// http://localhost:8080/api/customers

[
  {
    "id": "678c33ef69d4e2030664de4c",
    "name": "Yuji"
  },
  {
    "id": "678c33ef69d4e2030664de4d",
    "name": "Megumi"
  },
  {
    "id": "678c33ef69d4e2030664de4e",
    "name": "Nobara"
  },
  {
    "id": "678c33ef69d4e2030664de4f",
    "name": "Gojo"
  },
  {
    "id": "678c33ef69d4e2030664de50",
    "name": "Geto"
  },
  {
    "id": "678c33ef69d4e2030664de51",
    "name": "Sukuna"
  }
]
```

Console Log

```shell
/Users/hendisantika/Library/Java/JavaVirtualMachines/liberica-full-23.0.1/bin/java -XX:TieredStopAtLevel=1 -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true -Dmanagement.endpoints.jmx.exposure.include=* -javaagent:/Users/hendisantika/Applications/IntelliJ IDEA Ultimate.app/Contents/lib/idea_rt.jar=49492:/Users/hendisantika/Applications/IntelliJ IDEA Ultimate.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/hendisantika/IdeaProjects/spring-boot-mongock-sample/target/classes:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-data-mongodb/3.4.1/spring-boot-starter-data-mongodb-3.4.1.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter/3.4.1/spring-boot-starter-3.4.1.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-logging/3.4.1/spring-boot-starter-logging-3.4.1.jar:/Users/hendisantika/.m2/repository/ch/qos/logback/logback-classic/1.5.12/logback-classic-1.5.12.jar:/Users/hendisantika/.m2/repository/ch/qos/logback/logback-core/1.5.12/logback-core-1.5.12.jar:/Users/hendisantika/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.24.3/log4j-to-slf4j-2.24.3.jar:/Users/hendisantika/.m2/repository/org/apache/logging/log4j/log4j-api/2.24.3/log4j-api-2.24.3.jar:/Users/hendisantika/.m2/repository/org/slf4j/jul-to-slf4j/2.0.16/jul-to-slf4j-2.0.16.jar:/Users/hendisantika/.m2/repository/jakarta/annotation/jakarta.annotation-api/2.1.1/jakarta.annotation-api-2.1.1.jar:/Users/hendisantika/.m2/repository/org/yaml/snakeyaml/2.3/snakeyaml-2.3.jar:/Users/hendisantika/.m2/repository/org/mongodb/mongodb-driver-sync/5.2.1/mongodb-driver-sync-5.2.1.jar:/Users/hendisantika/.m2/repository/org/mongodb/bson/5.2.1/bson-5.2.1.jar:/Users/hendisantika/.m2/repository/org/mongodb/mongodb-driver-core/5.2.1/mongodb-driver-core-5.2.1.jar:/Users/hendisantika/.m2/repository/org/mongodb/bson-record-codec/5.2.1/bson-record-codec-5.2.1.jar:/Users/hendisantika/.m2/repository/org/springframework/data/spring-data-mongodb/4.4.1/spring-data-mongodb-4.4.1.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-tx/6.2.1/spring-tx-6.2.1.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-context/6.2.1/spring-context-6.2.1.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-beans/6.2.1/spring-beans-6.2.1.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-expression/6.2.1/spring-expression-6.2.1.jar:/Users/hendisantika/.m2/repository/org/springframework/data/spring-data-commons/3.4.1/spring-data-commons-3.4.1.jar:/Users/hendisantika/.m2/repository/org/slf4j/slf4j-api/2.0.16/slf4j-api-2.0.16.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-web/3.4.1/spring-boot-starter-web-3.4.1.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-json/3.4.1/spring-boot-starter-json-3.4.1.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.18.2/jackson-datatype-jdk8-2.18.2.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.18.2/jackson-datatype-jsr310-2.18.2.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/3.4.1/spring-boot-starter-tomcat-3.4.1.jar:/Users/hendisantika/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/10.1.34/tomcat-embed-core-10.1.34.jar:/Users/hendisantika/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/10.1.34/tomcat-embed-el-10.1.34.jar:/Users/hendisantika/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/10.1.34/tomcat-embed-websocket-10.1.34.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-web/6.2.1/spring-web-6.2.1.jar:/Users/hendisantika/.m2/repository/io/micrometer/micrometer-observation/1.14.2/micrometer-observation-1.14.2.jar:/Users/hendisantika/.m2/repository/io/micrometer/micrometer-commons/1.14.2/micrometer-commons-1.14.2.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-webmvc/6.2.1/spring-webmvc-6.2.1.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-aop/6.2.1/spring-aop-6.2.1.jar:/Users/hendisantika/.m2/repository/io/mongock/mongock-springboot-v3/5.2.4/mongock-springboot-v3-5.2.4.jar:/Users/hendisantika/.m2/repository/io/mongock/mongock-runner-core/5.2.4/mongock-runner-core-5.2.4.jar:/Users/hendisantika/.m2/repository/io/mongock/mongock-driver-api/5.2.4/mongock-driver-api-5.2.4.jar:/Users/hendisantika/.m2/repository/org/javassist/javassist/3.28.0-GA/javassist-3.28.0-GA.jar:/Users/hendisantika/.m2/repository/com/google/guava/guava/33.3.1-jre/guava-33.3.1-jre.jar:/Users/hendisantika/.m2/repository/com/google/guava/failureaccess/1.0.2/failureaccess-1.0.2.jar:/Users/hendisantika/.m2/repository/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:/Users/hendisantika/.m2/repository/org/checkerframework/checker-qual/3.43.0/checker-qual-3.43.0.jar:/Users/hendisantika/.m2/repository/com/google/j2objc/j2objc-annotations/3.0.0/j2objc-annotations-3.0.0.jar:/Users/hendisantika/.m2/repository/javax/inject/javax.inject/1/javax.inject-1.jar:/Users/hendisantika/.m2/repository/org/reflections/reflections/0.10.1/reflections-0.10.1.jar:/Users/hendisantika/.m2/repository/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar:/Users/hendisantika/.m2/repository/org/apache/maven/maven-artifact/3.6.1/maven-artifact-3.6.1.jar:/Users/hendisantika/.m2/repository/org/codehaus/plexus/plexus-utils/3.2.0/plexus-utils-3.2.0.jar:/Users/hendisantika/.m2/repository/org/apache/commons/commons-lang3/3.17.0/commons-lang3-3.17.0.jar:/Users/hendisantika/.m2/repository/com/google/code/gson/gson/2.11.0/gson-2.11.0.jar:/Users/hendisantika/.m2/repository/com/google/errorprone/error_prone_annotations/2.27.0/error_prone_annotations-2.27.0.jar:/Users/hendisantika/.m2/repository/io/mongock/mongock-api/5.2.4/mongock-api-5.2.4.jar:/Users/hendisantika/.m2/repository/io/mongock/mongock-utils/5.2.4/mongock-utils-5.2.4.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/3.4.1/spring-boot-autoconfigure-3.4.1.jar:/Users/hendisantika/.m2/repository/io/mongock/mongodb-springdata-v4-driver/5.2.4/mongodb-springdata-v4-driver-5.2.4.jar:/Users/hendisantika/.m2/repository/io/mongock/mongock-driver-core/5.2.4/mongock-driver-core-5.2.4.jar:/Users/hendisantika/.m2/repository/io/mongock/mongodb-sync-v4-driver/5.2.4/mongodb-sync-v4-driver-5.2.4.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-devtools/3.4.1/spring-boot-devtools-3.4.1.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot/3.4.1/spring-boot-3.4.1.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-docker-compose/3.4.1/spring-boot-docker-compose-3.4.1.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.18.2/jackson-databind-2.18.2.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.18.2/jackson-annotations-2.18.2.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.18.2/jackson-core-2.18.2.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.18.2/jackson-module-parameter-names-2.18.2.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-configuration-processor/3.4.1/spring-boot-configuration-processor-3.4.1.jar:/Users/hendisantika/.m2/repository/org/projectlombok/lombok/1.18.36/lombok-1.18.36.jar:/Users/hendisantika/.m2/repository/org/objenesis/objenesis/3.3/objenesis-3.3.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-core/6.2.1/spring-core-6.2.1.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-jcl/6.2.1/spring-jcl-6.2.1.jar id.my.hendisantika.mongock.SpringBootMongockSampleApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.4.1)

2025-01-19T06:06:18.005+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] m.h.m.SpringBootMongockSampleApplication : Starting SpringBootMongockSampleApplication using Java 23.0.1 with PID 55443 (/Users/hendisantika/IdeaProjects/spring-boot-mongock-sample/target/classes started by hendisantika in /Users/hendisantika/IdeaProjects/spring-boot-mongock-sample)
2025-01-19T06:06:18.006+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] m.h.m.SpringBootMongockSampleApplication : No active profile set, falling back to 1 default profile: "default"
2025-01-19T06:06:18.028+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2025-01-19T06:06:18.028+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2025-01-19T06:06:18.033+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] .s.b.d.c.l.DockerComposeLifecycleManager : Using Docker Compose file /Users/hendisantika/IdeaProjects/spring-boot-mongock-sample/compose.yaml
2025-01-19T06:06:18.418+07:00  INFO 55443 --- [spring-boot-mongock-sample] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Network spring-boot-mongock-sample_main-network  Creating
2025-01-19T06:06:18.452+07:00  INFO 55443 --- [spring-boot-mongock-sample] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Network spring-boot-mongock-sample_main-network  Created
2025-01-19T06:06:18.454+07:00  INFO 55443 --- [spring-boot-mongock-sample] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Volume "spring-boot-mongock-sample_mongo-data"  Creating
2025-01-19T06:06:18.463+07:00  INFO 55443 --- [spring-boot-mongock-sample] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Volume "spring-boot-mongock-sample_mongo-data"  Created
2025-01-19T06:06:18.464+07:00  INFO 55443 --- [spring-boot-mongock-sample] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container mongodb804  Creating
2025-01-19T06:06:18.514+07:00  INFO 55443 --- [spring-boot-mongock-sample] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container mongodb804  Created
2025-01-19T06:06:18.516+07:00  INFO 55443 --- [spring-boot-mongock-sample] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container mongodb804  Starting
2025-01-19T06:06:18.667+07:00  INFO 55443 --- [spring-boot-mongock-sample] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container mongodb804  Started
2025-01-19T06:06:18.667+07:00  INFO 55443 --- [spring-boot-mongock-sample] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container mongodb804  Waiting
2025-01-19T06:06:19.169+07:00  INFO 55443 --- [spring-boot-mongock-sample] [utReader-stderr] o.s.boot.docker.compose.core.DockerCli   :  Container mongodb804  Healthy
2025-01-19T06:06:22.717+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data MongoDB repositories in DEFAULT mode.
2025-01-19T06:06:22.734+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 14 ms. Found 1 MongoDB repository interface.
2025-01-19T06:06:22.904+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2025-01-19T06:06:22.909+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-01-19T06:06:22.909+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.34]
2025-01-19T06:06:22.924+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-01-19T06:06:22.924+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 420 ms
2025-01-19T06:06:22.997+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] org.mongodb.driver.client                : MongoClient with metadata {"driver": {"name": "mongo-java-driver|sync|spring-boot", "version": "5.2.1"}, "os": {"type": "Darwin", "name": "Mac OS X", "architecture": "aarch64", "version": "15.2"}, "platform": "Java/BellSoft/23.0.1+13"} created with settings MongoClientSettings{readPreference=primary, writeConcern=WriteConcern{w=null, wTimeout=null ms, journal=null}, retryWrites=true, retryReads=true, readConcern=ReadConcern{level=null}, credential=MongoCredential{mechanism=null, userName='yu71', source='admin', password=<hidden>, mechanismProperties=<hidden>}, transportSettings=null, commandListeners=[], codecRegistry=ProvidersCodecRegistry{codecProviders=[ValueCodecProvider{}, BsonValueCodecProvider{}, DBRefCodecProvider{}, DBObjectCodecProvider{}, DocumentCodecProvider{}, CollectionCodecProvider{}, IterableCodecProvider{}, MapCodecProvider{}, GeoJsonCodecProvider{}, GridFSFileCodecProvider{}, Jsr310CodecProvider{}, JsonObjectCodecProvider{}, BsonCodecProvider{}, EnumCodecProvider{}, com.mongodb.client.model.mql.ExpressionCodecProvider@4b1b3310, com.mongodb.Jep395RecordCodecProvider@6883731b, com.mongodb.KotlinCodecProvider@6c44d70d]}, loggerSettings=LoggerSettings{maxDocumentLength=1000}, clusterSettings={hosts=[127.0.0.1:27017], srvServiceName=mongodb, mode=SINGLE, requiredClusterType=UNKNOWN, requiredReplicaSetName='null', serverSelector='null', clusterListeners='[]', serverSelectionTimeout='30000 ms', localThreshold='15 ms'}, socketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=0, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, heartbeatSocketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=10000, receiveBufferSize=0, proxySettings=ProxySettings{host=null, port=null, username=null, password=null}}, connectionPoolSettings=ConnectionPoolSettings{maxSize=100, minSize=0, maxWaitTimeMS=120000, maxConnectionLifeTimeMS=0, maxConnectionIdleTimeMS=0, maintenanceInitialDelayMS=0, maintenanceFrequencyMS=60000, connectionPoolListeners=[], maxConnecting=2}, serverSettings=ServerSettings{heartbeatFrequencyMS=10000, minHeartbeatFrequencyMS=500, serverMonitoringMode=AUTO, serverListeners='[]', serverMonitorListeners='[]'}, sslSettings=SslSettings{enabled=false, invalidHostNameAllowed=false, context=null}, applicationName='null', compressorList=[], uuidRepresentation=JAVA_LEGACY, serverApi=null, autoEncryptionSettings=null, dnsClient=null, inetAddressResolver=null, contextProvider=null, timeoutMS=null}
2025-01-19T06:06:23.003+07:00  INFO 55443 --- [spring-boot-mongock-sample] [127.0.0.1:27017] org.mongodb.driver.cluster               : Monitor thread successfully connected to server with description ServerDescription{address=127.0.0.1:27017, type=STANDALONE, cryptd=false, state=CONNECTED, ok=true, minWireVersion=0, maxWireVersion=25, maxDocumentSize=16777216, logicalSessionTimeoutMinutes=30, roundTripTimeNanos=6630250, minRoundTripTimeNanos=0}
2025-01-19T06:06:23.044+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2025-01-19T06:06:23.236+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.core.builder.RunnerBuilderBase     : Mongock runner COMMUNITY version[5.2.4]
2025-01-19T06:06:23.237+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.core.builder.RunnerBuilderBase     : Running Mongock with NO metadata
2025-01-19T06:06:23.237+07:00  WARN 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.core.builder.RunnerBuilderBase     : Property transaction-enabled not provided. It will become true as default in next versions. Set explicit value to false in case transaction are not desired.
2025-01-19T06:06:23.237+07:00  WARN 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.core.builder.RunnerBuilderBase     : Property transaction-enabled not provided and is unknown if driver is transactionable. BY DEFAULT MONGOCK WILL RUN IN NO-TRANSACTION MODE.
2025-01-19T06:06:23.280+07:00 DEBUG 55443 --- [spring-boot-mongock-sample] [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : 3 mappings in 'requestMappingHandlerMapping'
2025-01-19T06:06:23.302+07:00 DEBUG 55443 --- [spring-boot-mongock-sample] [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Patterns [/webjars/**, /**] in 'resourceHandlerMapping'
2025-01-19T06:06:23.310+07:00 DEBUG 55443 --- [spring-boot-mongock-sample] [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerAdapter : ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
2025-01-19T06:06:23.323+07:00 DEBUG 55443 --- [spring-boot-mongock-sample] [  restartedMain] .m.m.a.ExceptionHandlerExceptionResolver : ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
2025-01-19T06:06:23.364+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2025-01-19T06:06:23.368+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] m.h.m.SpringBootMongockSampleApplication : Started SpringBootMongockSampleApplication in 5.5 seconds (process running for 5.787)
2025-01-19T06:06:23.382+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] org.reflections.Reflections              : Reflections took 8 ms to scan 1 urls, producing 2 keys and 2 values
2025-01-19T06:06:23.384+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] org.reflections.Reflections              : Reflections took 1 ms to scan 1 urls, producing 2 keys and 2 values
2025-01-19T06:06:23.394+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.driver.core.lock.LockManagerDefault  : Mongock trying to acquire the lock
2025-01-19T06:06:23.402+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.driver.core.lock.LockManagerDefault  : Mongock acquired the lock until: Sun Jan 19 06:07:23 WIB 2025
2025-01-19T06:06:23.402+07:00  INFO 55443 --- [spring-boot-mongock-sample] [      Thread-24] i.m.driver.core.lock.LockManagerDefault  : Starting mongock lock daemon...
2025-01-19T06:06:23.406+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.c.e.system.SystemUpdateExecutor    : Mongock starting the system update execution id[2025-01-19T06:06:23.236218-465]...
2025-01-19T06:06:23.406+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[io.mongock.runner.core.executor.system.changes.SystemChangeUnit00001] with arguments: []
2025-01-19T06:06:23.407+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[beforeExecution] with arguments: [io.mongock.driver.mongodb.springdata.v4.SpringDataMongoV4ChangeEntryRepository]
2025-01-19T06:06:23.407+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="system-change-00001_before", "type"="before-execution", "author"="mongock", "class"="SystemChangeUnit00001", "method"="beforeExecution"}
2025-01-19T06:06:23.410+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[execution] with arguments: [io.mongock.driver.mongodb.springdata.v4.SpringDataMongoV4ChangeEntryRepository]
2025-01-19T06:06:23.412+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="system-change-00001", "type"="execution", "author"="mongock", "class"="SystemChangeUnit00001", "method"="execution"}
2025-01-19T06:06:23.414+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.driver.core.lock.LockManagerDefault  : Mongock waiting to release the lock
2025-01-19T06:06:23.431+07:00  INFO 55443 --- [spring-boot-mongock-sample] [      Thread-24] i.m.driver.core.lock.LockManagerDefault  : Cancelled mongock lock daemon
2025-01-19T06:06:23.431+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.driver.core.lock.LockManagerDefault  : Mongock releasing the lock
2025-01-19T06:06:23.433+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.driver.core.lock.LockManagerDefault  : Mongock released the lock
2025-01-19T06:06:23.433+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.c.e.system.SystemUpdateExecutor    : Mongock has finished the system update execution
2025-01-19T06:06:23.436+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] org.reflections.Reflections              : Reflections took 2 ms to scan 1 urls, producing 1 keys and 1 values
2025-01-19T06:06:23.436+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] org.reflections.Reflections              : Reflections took 0 ms to scan 1 urls, producing 1 keys and 1 values
2025-01-19T06:06:23.438+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.driver.core.lock.LockManagerDefault  : Mongock trying to acquire the lock
2025-01-19T06:06:23.440+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.driver.core.lock.LockManagerDefault  : Mongock acquired the lock until: Sun Jan 19 06:07:23 WIB 2025
2025-01-19T06:06:23.440+07:00  INFO 55443 --- [spring-boot-mongock-sample] [      Thread-25] i.m.driver.core.lock.LockManagerDefault  : Starting mongock lock daemon...
2025-01-19T06:06:23.442+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.c.e.o.migrate.MigrateExecutorBase  : Mongock starting the data migration sequence id[2025-01-19T06:06:23.236218-465]...
2025-01-19T06:06:23.442+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[id.my.hendisantika.mongock.migration.CustomerInitialization] with arguments: []
2025-01-19T06:06:23.459+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[beforeExecution] with arguments: [org.springframework.data.mongodb.core.MongoTemplate]
2025-01-19T06:06:23.461+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.h.m.m.CustomerInitialization         : ######### BeforeExecution!!!
2025-01-19T06:06:23.461+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="customer-initializer_before", "type"="before-execution", "author"="myself", "class"="CustomerInitialization", "method"="beforeExecution"}
2025-01-19T06:06:23.465+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.c.executor.ChangeLogRuntimeImpl    : method[execution] with arguments: [jdk.proxy3.$Proxy77]
2025-01-19T06:06:23.465+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.h.m.m.CustomerInitialization         : ######### Initialize data!!!
2025-01-19T06:06:23.499+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.h.m.m.CustomerInitialization         : [Customer(id=678c33ef69d4e2030664de4c, name=Yuji), Customer(id=678c33ef69d4e2030664de4d, name=Megumi), Customer(id=678c33ef69d4e2030664de4e, name=Nobara), Customer(id=678c33ef69d4e2030664de4f, name=Gojo), Customer(id=678c33ef69d4e2030664de50, name=Geto), Customer(id=678c33ef69d4e2030664de51, name=Sukuna)]
2025-01-19T06:06:23.499+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.core.executor.ChangeExecutorBase   : APPLIED - {"id"="customer-initializer", "type"="execution", "author"="myself", "class"="CustomerInitialization", "method"="execution"}
2025-01-19T06:06:23.501+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.driver.core.lock.LockManagerDefault  : Mongock waiting to release the lock
2025-01-19T06:06:23.501+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.driver.core.lock.LockManagerDefault  : Mongock releasing the lock
2025-01-19T06:06:23.503+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.driver.core.lock.LockManagerDefault  : Mongock released the lock
2025-01-19T06:06:23.503+07:00  INFO 55443 --- [spring-boot-mongock-sample] [  restartedMain] i.m.r.c.e.o.migrate.MigrateExecutorBase  : Mongock has finished

```
