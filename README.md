# Santander Dev Week 2023
Java RESTfull API criada para a Santander Dev Week

## Diagrama de Classes

```mermaid

classDiagram
    class User {
        +String name
        +Account account
        +Card card
        +Feature[] features
        +News[] news
    }

    class Account {
        +String number
        +String agency
        +double balance
        +double limit
    }

    class Card {
        +String number
        +double limit
    }

    class Feature {
        +String icon
        +String description
    }

    class News {
        +String icon
        +String description
    }

    User "1" * --"1" Account
    User "1" * --"N" Card
    User "1" * --"1" Feature
    User "1" * --"N" News

    ```
