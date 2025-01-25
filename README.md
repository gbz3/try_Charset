# try_Charset

## 環境構築

- [Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [Apache Maven 入門](https://zenn.dev/caunus/books/apache-maven-introduction)

```shell
$ mvn -v
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 17.0.13, vendor: Ubuntu, runtime: /usr/lib/jvm/java-17-openjdk-arm64
Default locale: en, platform encoding: UTF-8
OS name: "linux", version: "5.15.153.1-microsoft-standard-wsl2", arch: "aarch64", family: "unix"
```

## プロジェクト作成

```shell
$ mvn archetype:generate \
-DgroupId=com.github.gbz3.try_Charset \
-DartifactId=my-charset \
-DarchetypeArtifactId=maven-archetype-quickstart \
-DarchetypeVersion=1.5 \
-DinteractiveMode=false
```

## 最小限

- [JavaのCharsetを作る](https://qiita.com/tomo-92/items/946a221931fe8ffa18ac)

```shell
$ jshell --class-path my-charset/target/my-charset-1.0-SNAPSHOT.jar 0LEVEL.jsh
charset = windows-31j
```