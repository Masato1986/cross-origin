# client
具体的な設定値は

 - [TODO client-1](src/environments/environment.ts)
 - [TODO client-2](src/environments/environment.prod.ts)
 - [TODO client-3](src/app/task-data.service.ts)
 - [TODO client-4](src/app/task-data.service.ts)

を参照してください。

|ng serve|ng build（オプションなし）|ng build --prod|
|:---:|:---:|:---:|
|environment.ts|environment.ts|environment.prod.ts|

がそれぞれ適用されるようになります。

### 補足
 - ng serve : Angular CLI がもつ検証用サーバでポート番号4200で起動する
 - ng build : Angular CLI がもつアプリケーションのビルド機能
 - Angular CLI : Angularアプリ開発用のコマンドラインインターフェース
