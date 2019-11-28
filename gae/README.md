# 概要

[Build Type Gradle Plugin AppEngine extension](https://github.com/yj-abe/build-types-appengine-gradle-plugin)のサンプル  
アプリはGoogle App Engine + EndPoints Frameworkで構築されています。

# ローカルサーバーの起動

ローカルサーバーの起動する場合は、実行したいbuild typeのrunタスクを実行します。
例えば、ローカルビルドタイプの設定でサーバーを起動する場合は以下のようにします。

```
./gradlew gae:appengineLocalRun
```

# デプロイ

実際にデプロイしてみる場合には`INPUT YOUR ${build type name} SERVER PROJECT ID`
の部分を実際のプロジェクトIDに変更してください。  

開発環境用にデプロイする場合は以下のようなgradleタスクを実行します。

```
./gradlew gae:appengineDevelopDeploy
```
