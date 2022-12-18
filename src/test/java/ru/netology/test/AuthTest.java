package ru.netology.test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.data.DataGenerator;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


class AuthTest {

    @BeforeEach
    void setup() {
        open("http://localhost:9999");
    }

    @Test
    @DisplayName("Should successfully login with active registered user")
    void shouldSuccessfulLoginIfRegisteredActiveUser() {
        DataGenerator.RegistrationDto registeredUser = DataGenerator.Registration.getRegisteredUser("active");
        $("[data-test-id='login'] input").setValue(registeredUser.getLogin());
        $("[data-test-id='password'] input").setValue(registeredUser.getPassword());
        $("[data-test-id='action-login'] span").click();
        // TODO: добавить логику теста, в рамках которого будет выполнена попытка входа в личный кабинет с учётными
        //  данными зарегистрированного активного пользователя, для заполнения полей формы используйте
        //  пользователя registeredUser
    }

//    @Test
//    @DisplayName("Should get error message if login with not registered user")
//    void shouldGetErrorIfNotRegisteredUser() {
//        var notRegisteredUser = getUser("active");
//        // TODO: добавить логику теста в рамках которого будет выполнена попытка входа в личный кабинет
//        //  незарегистрированного пользователя, для заполнения полей формы используйте пользователя notRegisteredUser
//    }
//
//    @Test
//    @DisplayName("Should get error message if login with blocked registered user")
//    void shouldGetErrorIfBlockedUser() {
//        var blockedUser = getRegisteredUser("blocked");
//        // TODO: добавить логику теста в рамках которого будет выполнена попытка входа в личный кабинет,
//        //  заблокированного пользователя, для заполнения полей формы используйте пользователя blockedUser
//    }
//
//    @Test
//    @DisplayName("Should get error message if login with wrong login")
//    void shouldGetErrorIfWrongLogin() {
//        var registeredUser = getRegisteredUser("active");
//        var wrongLogin = getRandomLogin();
//        // TODO: добавить логику теста в рамках которого будет выполнена попытка входа в личный кабинет с неверным
//        //  логином, для заполнения поля формы "Логин" используйте переменную wrongLogin,
//        //  "Пароль" - пользователя registeredUser
//    }
//
//    @Test
//    @DisplayName("Should get error message if login with wrong password")
//    void shouldGetErrorIfWrongPassword() {
//        var registeredUser = getRegisteredUser("active");
//        var wrongPassword = getRandomPassword();
//        // TODO: добавить логику теста в рамках которого будет выполнена попытка входа в личный кабинет с неверным
//        //  паролем, для заполнения поля формы "Логин" используйте пользователя registeredUser,
//        //  "Пароль" - переменную wrongPassword
//    }
}