# NextStep-StringCalculator

> 자바 웹 프로그래밍 Next Step - 문자열 계산기 구현을 통한 테스트와 리팩토링

## 요구사항

문자열 계산기의 요구사항은 전달하는 문자를 구분자로 분리한 후 각 숫자의 합을 구해 반환해야 한다.

- 쉽표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.
- 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 "//;\n;1;2;3"과
  같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- 문자열 계산기에 음수를 전달하는 경우 RuntimeException으로 예외 처리해야 한다.

## 공부할 것

- TDD
- 정규 표현식
- 에러 처리 방식

## 테스트 내용

- [x] 1,2,3 을 전달하는 경우, 6을 출력
- [x] 1,2,3,4,5,6 을 전달하는 경우, 21을 출력
- [x] 1;2;3 을 전달하는 경우, 6을 출력
- [x] 1;2;3;4;5;6 을 전달하는 경우, 21을 출력
- [x] 1,2;3 을 전달하는 경우, 에러 발생
- [x] 1,2,a 을 전달하는 경우, 에러 발생
- [x] 1,2,-3 을 전달하는 경우, 에러 발생
- [ ] //;\n;1;2;3 을 전달하는 경우, 6을 출력
- [ ] //;\n;1,2;3 을 전달하는 경우, 에러 발생