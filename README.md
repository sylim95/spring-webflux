# spring webflux 간단 예제

Spring WebFlux는 Spring 5에서 새롭게 추가된 모듈이다.
WebFlux는 클라이언트, 서버에서 reactive 스타일의 애플리케이션 개발을 도와주는 모듈이며, reactive-stack web framework이며 non-blocking에 reactive stream을 지원한다.

- 장점: 고성능, spring과 완벽한 통합, netty 지원, 비동기 non-blocking 메세지 처리, Back Pressure

❓netty: 프로토콜 서버 및 클라이언트와 같은 네트워크 응용 프로그램을 빠르고 쉽게 개발할 수 있는 NIO(Non-Blocking Input Output) 클라이언트 서버 프레임워크이다.

❓Back Pressure: 스프링 배치에서 다루었던 개념으로 빠른 Publisher - 느린 Subscriber 문제를 해결하는 원리이다. Publisher의 일방적 데이터 Push가 아니라 Subscriber가 처리할 수 있을 만큼의 데이터만 Subscriber의 요청에 의해서 전달해 주는 것이다.
