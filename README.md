
# Automation Login Test

## Description / Mô Tả

EN: This project automates the login functionality test for a website using Selenium WebDriver and JUnit. The script includes taking a screenshot after a successful login and logging the test steps using Log4j.

VI: Dự án này tự động hóa bài kiểm tra chức năng đăng nhập cho một trang web sử dụng Selenium WebDriver và JUnit. Script bao gồm chụp màn hình sau khi đăng nhập thành công và ghi lại các bước kiểm tra bằng Log4j.

## Requirement / Yêu Cầu

- Java Development Kit (JDK)
- Maven
- Internet connection / Kết nối Internet

## Setup / Thiết Lập

1. Clone the repository / Clone repository:
   ```bash
   git clone https://github.com/BaoBaoSG/TechXSelenium.git
   ```

2. Navigate to the project directory / Điều hướng đến thư mục dự án:
   ```bash
   cd TechXSelenium
   ```

3. Install dependencies / Cài đặt các phụ thuộc:
   ```bash
   mvn install
   ```

## Run the tests / Chạy các bài kiểm tra

To run the tests, use the following command / Để chạy các bài kiểm tra, sử dụng lệnh sau:
```bash
mvn test
```

## Project Structure / Cấu Trúc Dự Án

```
TechXSelenium/
├── .idea/
├── screenshots/
│   └── screenshot.png
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── login/
│   │                   └── Login.java
│   ├── test/
│   │   └── java/
│   │       └── login/
│   │           └── LoginTest.java
│   └── resources/
│       └── log4j2.xml
├── target/
├── .gitignore
├── pom.xml
└── README.md
```



## Contact / Liên Hệ

EN: For any questions or support, please contact BaoBaoSG.

VI: Để có bất kỳ câu hỏi hoặc hỗ trợ nào, vui lòng liên hệ BaoBaoSG.