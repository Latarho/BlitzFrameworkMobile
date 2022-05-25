# Проект по автоматизации тестирования для мобильного приложения Wikipedia

## 📃 Содержание:

- [Технологии и инструменты](#computer-технологии-и-инструменты)
- [Реализованные проверки](#boom-Реализованные-проверки)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Запуск из терминала](#computer-Запуск-тестов-из-терминала)
- [Отчет в Allure report](#-отчет-в-allure-report)
- [Отчет в Telegram](#-уведомление-в-telegram-при-помощи-бота)
- [Видео пример прохождения тестов](#-видео-пример-прохождения-теста)

## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="image/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="image/logo/Java.svg">
<img width="6%" title="Selenide" src="image/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="image/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="image/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="image/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="image/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="image/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="image/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="image/logo/Telegram.svg">
<img width="6%" title="Appium" src="image/logo/Appium.svg">
<img width="6%" title="Browserstack" src="image/logo/Browserstack.svg">
</p>

## :boom: Реализованные проверки

- Проверка стартовых экранов и поиска в приложении

## <img src="image/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Сборка в Jenkins
<a target="_blank" href="https://jenkins.autotests.cloud/job/011-Latarho-qa-guru-BlitzFrameworkMobile/">Jenkins job</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/C11-eisritter-unit13-homework/"><img src="image/screenshots/jenkins-dashboard.png" alt="Jenkins"/></a>
</p>

### :maple_leaf: Особенности сборки в Jenkins:

- Сборку можно запустить как через сервис Browserstack так и через Appium и с помощью реального подключенного телефона.

## :computer: Запуск тестов из терминала

Локальный запуск на эмуляторе:
```
gradle clean test DdeviceHost=emulation 
```
Локальный запуск на реальном устройстве:
```
gradle clean test DdeviceHost=real 
```
Запуск в Browserstack:
```
gradle clean test DdeviceHost=browserstack
```
## <img src="image/logo/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/C11-eisritter-unit13-homework/allure">Allure report</a>

### :lady_beetle: Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="image/screenshots/allure-main-page.png">
</p>

### :cherries: Тесты

<p align="center">
<img title="Allure Tests" src="image/screenshots/allure-test-page.png">
</p>

## <img src="image/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Telegram bot" src="image/screenshots/telegram_bot.png" >
</p>

## <img src="image/logo/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Видео пример прохождения теста

<p align="center">
<img title="Selenoid Video" src="image/gif/testvideo.gif" alt="video"> 
</p>
