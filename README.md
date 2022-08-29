# 푸마시

![Untitled](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled.png)

# 팀명 <푸머>

- 구성원
    
    오지수(2110191) - 팀장 (백엔드)
    
    김보현(2111039) - 백엔드 
    
    남다은(2115903)- 프론트엔드
    
    박강희(2111841) - 프론트엔드
    

### 🎁출물 주소

- Front-End

[https://github.com/Sookmyung-Software-Hackathon/Team20_Android.git](https://github.com/Sookmyung-Software-Hackathon/Team20_Android.git)

- Back-End

[https://github.com/Sookmyung-Software-Hackathon/Team20-server.git](https://github.com/Sookmyung-Software-Hackathon/Team20-server.git)

### 🎁분야

앱

## 🎁 서비스 개요

---

### "**단절된 사회 속에서 공존을 도모하다!**"

---

‘푸마시’는 물품의 ‘품’과 물건을 교환하는 ‘앗이’의 의미를 담아 ‘푸마시’라고 짓게 되었습니다. 기존 ‘품앗이’ 단어의 ‘품’에 해당하는 의미와는 조금 다르게  ‘푸마시’의 ‘품’은 이웃과 함께 나누는 물품을 의미합니다.

언젠가 쓰일 것 같아 버리지 못하고 자리만 차지하고 있던 물건,  필요하지만 비싸서 혹은 한두번만 필요해 사는 것이 망설여지는 물건 등 이런저런 이유로 방치되거나 사지 못한 물건들을 이웃과 함께 공유할 수 있습니다.

푸마시와 함께 화합의 장을 이루어 봅시다!

## 🎁 서비스 목적

---

늘어나는 1인 가구의 시대, 우리는 이웃들과 단절되어 있습니다. 

활성화된 인터넷의 발전으로 인해 사람들과의 연결은 쉬워졌지만, 인터넷 속의 이웃으로만 존재할 뿐 당장 옆집, 윗집에도 누가 사는지 모를 정도로 이웃과의 교류가 소원합니다.

또한 한정되어 있는 공간, 늘어나는 가구 수에 의해 주거 공간은 점점 더 줄어들고 있습니다.

그에 비해 과거 전통사회에서는 거주지를 중심으로 이웃 간 교류가 활발하고 상부상조하는 커뮤니티가 자연스럽게 형성되었습니다 .

그렇기에 우리는 우리 선조들의 ‘품앗이’ 정신을 물려받아 삶의 질과 이웃 간의 관계 향상에 도움이 되고자 합니다.

품앗이는 1대1로 일을 서로 거들어 주면서 품을 갚는 것을 의미하며 일을 한다는 뜻의 '품'과 갚는다는 뜻의 '앗이' 가 결합한 합성어입니다.

서로 일을 도와주며 돈독해졌던 과거에서 착안해서 서로에게 필요한 물건들을 빌려주며 주변인들과의 공존을 도모하고자 합니다.

## 🎁 핵심 기술 및 주요 기능

---

![Untitled](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%201.png)

![Untitled](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%202.png)

![스크린샷 2022-08-28 오후 9.26.52.png](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/%25EC%258A%25A4%25ED%2581%25AC%25EB%25A6%25B0%25EC%2583%25B7_2022-08-28_%25EC%2598%25A4%25ED%259B%2584_9.26.52.png)

![스크린샷 2022-08-28 오후 9.27.35.png](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/%25EC%258A%25A4%25ED%2581%25AC%25EB%25A6%25B0%25EC%2583%25B7_2022-08-28_%25EC%2598%25A4%25ED%259B%2584_9.27.35.png)

Java, Spring, MySql, AndroidStudio 

### 주요 기능

- **꾸기(대여) 관련 기능**
    - 메인 화면의 네비게이션바를 통해서 꾸기에 접근 가능
    - 꾸기에서 대여를 원한다는 의미인 ‘꾸기’ 버튼을 누르면 자바의 액티비티 이동
    - 이동한 페이지에서는 얼마나 오래 대여를 원하는지 spinner기능을 통해 정할 수 있음
    - 내가 대여 중인 푸마 목록(`푸마 꾸는 중`) 중 하나를 터치하면 내가 대여하고 있는 푸마의 정보를 확인할 수 있음 → (`꾸고 있는 푸마`)
    - `꾸기 완료`의 글을 터치하면 대여가 완료된 푸마 정보를 확인할 수 있음 (→ 들여다보기)
- **올리기(등록) 관련 기능**
    - 메인 페이지의 +이미지를 누르거나 네비게이션 바를 통해 접근 가능
    - `푸마 올리기` 화면에서는 텍스트 편집을 통해 양식에 맞게 사용자가 빌려주고자 하는 푸마를 직접 등록할 수 있음
    - 여러가지 빈칸(제목, 푸마의 이미지, 일 당 대여 요금, 상세 설명)을 통해 푸마에 대한 정보를 등록할 수 있고, ‘올리기’버튼을 통해서 등록이 가능
- **돌려주기(반납) 관련 기능**
    - 푸마 돌려주기를 터치하면 사용자가 대여했던 목록이 보임
        - 이 중 하나를 클릭하면 그 푸마에 대한 상세 설명 페이지(`돌려주기`)를 확인할 수 있고 버튼을 통해 반납할 수 있음
- **고치기(수정) 관련 기능**
    - 내가 등록한 푸마 목록(`내 푸마`)에서는 내가 등록한 푸마의 정보를 수정할 수 있는 화면(`고치기`)이 있음
    - 하단의 고치기, 버리기 버튼 통해 내가 등록한 푸마의 정보를 수정하거나 삭제 가능

## 🎁 기대 효과

---

통계청에 의하면 2021년 1인 가구는 전국 33.4%, 7,165,788명으로 매년 증가하고 있습니다.  1인 가구의 삶의 형태는 주거 혹은 식생활 등에서 규모의 경제가 약합니다.  ‘푸마시’를 통해 푸마(물품)들을 공유함으로써 생활비 절감, 주거공간 확보 등 그들의 **삶의 질을 향상**시킬 수 있습니다.

단절된 사회로 인해 개인주의 심화, 이웃간 교류 소원은 고독사, 소외감 등 여러 문제들을 야기합니다. ‘푸마시’를 통해 푸마(물품)를 공유함으로써 단절된 사회로 야기된 문제들을 해결하고 공동체로서 **공존**할 ****수 있습니다. 또한 다양한 세대가 공존하는 지역주민들이 서로에게 필요한 푸마(물품)들을 빌려주며 세대 간의 **화합**을 **도모**합니다. 

## 🎁 페이지 구성(시나리오)

---

푸마시는 ‘품앗이’ 단어의 의미에 기반한 어플인 만큼, 쓰이는 어휘 또한 그 당시 쓰일 만한 어휘를 사용하고자 했습니다. 저희 어플에서 푸마는 곧 사람들이 주고 받는 물건을 의미합니다.

---

![로그인](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%203.png)

로그인

- 아이디와 패스워드를 통해
    
    메인페이지로 이동
    
- 회원가입을 누르면
    
    회원가입 페이지로 
    
    이동
    

![회원가입](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%204.png)

회원가입

- 다양한 정보 입력칸을 통해
    
    정보를 입력
    
- 중복되는 아이디는 로그인하지 못함
- 취소를 누르면 로그인 페이지로 다시 이동

![마이페이지](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%205.png)

마이페이지

- 프로필
- 슬라이드를 통해 여러
    
    물품들을 간략하게 
    
    볼 수 있음
    
- 내 푸마
    
    내가 등록한 푸마들을 
    
    확인 가능
    
    이미지를 누르면 상세 
    
    페이지에서 더 자세한 
    
    설명 확인 가능
    
- 푸마 꾸는 중
    
    내가 대여 중인 푸마들을
    
    확인 가능
    
- 꾸기 완료

---

![고치기](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%206.png)

고치기

- 내 푸마 → 고치기
    
    내가 등록한 푸마의 정보를 수정
    
- 푸마의 이미지를 갤러리로부터 가져올 수 있음
- 품삯이 몇 냥인지 수정할 수 있으며 그 아래에 상세 설명도 수정할 수 있음

![푸마 꾸는 중](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%207.png)

푸마 꾸는 중

- 푸마 꾸는 중(메인) → 푸마 꾸는 중
- 대여 중인 푸마에 대한 정보를 확인할 수 있음
- 하단에는 대여 기한이 표시되어 있음

![들여다보기](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%208.png)

들여다보기

- 꾸기 완료 → 들여다보기
    
    이미 반납이 완료된 푸마에 대한 상세 설명 확인 가능
    

---

![푸마 목록](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%209.png)

푸마 목록

- 기존에 꾸기에 추가된 푸마들을 모아놓은 페이지로, 카테고리에 따라 해당하는 푸마를 확인할 수 있음
- 슬라이드를 통해 푸마 목록들을 내려볼 수 있음

![카테고리 별 푸마 목록](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%2010.png)

카테고리 별 푸마 목록

- 한 카테고리를 클릭 시 그 카테고리에 해당하는 푸마 목록 확인

![꾸기](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%2011.png)

꾸기

- 푸마에 대한 상세 설명이 나타나 있다.
- 푸마 목록에서 대여하고 싶은 물품을 선택하면 나오는 상세 페이지

![꾸기 기한](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%2012.png)

꾸기 기한

- 꾸기화면에서 꾸기 버튼을 누르면 꾸기 기한 설정

---

![네비게이션 바](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%2013.png)

네비게이션 바

![돌려주기](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%2014.png)

돌려주기

- 네비게이션 바를 통해서
    
    돌려주기에 갈 수 있음
    
- 대여 중인 푸마들을 모아
    
    놓은 화면으로, 슬라이드를
    
    통해 내려볼 수 있고, 게시
    
    글을 눌러서 옆의 돌려주기
    
    페이지로 이동할 수 있음
    

![돌려주기](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%2015.png)

돌려주기

- 왼쪽의 게시글을 터치하면 이동하는 페이지로, 대여했던 푸마를 돌려줄 수 있음

![올리기](%E1%84%91%E1%85%AE%E1%84%86%E1%85%A1%E1%84%89%E1%85%B5%20d700a4e64c5044d4b5098a81186bcfbb/Untitled%2016.png)

올리기

- 메인페이지의 +버튼과 네비게이션 바를 통해서 푸마 올리기를 할 수 있음
- 푸마 이름, 이미지, 품삯과 상세설명을 고쳐서 올릴 수 있음

---