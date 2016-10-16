# Defence

[![CI Status](http://img.shields.io/travis/games-neox/Defence.svg?style=flat)](https://travis-ci.org/games-neox/Defence)
[![Download](https://api.bintray.com/packages/games-neox/maven/defence/images/download.svg)](https://bintray.com/games-neox/maven/defence/_latestVersion)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/games-neox/Defence/blob/master/LICENSE)

Defenensive-code tool for Android/Java/Kotlin (enabled for `DEBUG` builds only)

```java
Defence.assertNotNull(nullableTestObject, errorMessage);
Defence.assertCondition(booleanTestCondition, errorMessage);
```  

## Requirements

Minimum supported `Android` version: `14 Ice Cream Sandwich`

## Installation

Defence is available through [jcenter](https://bintray.com/bintray/jcenter). To install it, simply add the following line to your gradle file:

```gradle
dependencies {
    debugCompile 'com.gamesneox.defence:defence:0.4.1:debug@aar'
    releaseCompile 'com.gamesneox.defence:defence:0.4.1:release@aar'
}
```  

## Author

Games Neox, games.neox@gmail.com

## License

Lazy is available under the MIT license. See the LICENSE file for more info.
