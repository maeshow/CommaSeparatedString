## CommaSeparatedString

数字をカンマ区切り文字列に変換する

## Background

金額やスコアなどを表示するときに、カンマ区切り文字列で表示したい場合がある

## Overview

数字からカンマ区切り文字列を作成するメソッド

## Detail

※String.format()など、そのままズバリできてしまうメソッドの利用は禁止

### インターフェース

#### CUI

実行例

``` console
123
12,345
1,234,567
-1,234,567
123,456,789
-123,456,789
```

## Structure Overview

- src/
    - App
        - main()
        - commaSeparatedString(int a)
        - isSeparate(int count)
        - isNegative(int a)