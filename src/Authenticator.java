import javax.swing.JOptionPane; // Объявляем import имени класса JOptionPane для создания диалогового окна с вводом в него данных.

public class Authenticator {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog ("Username:");
        String password = JOptionPane.showInputDialog ("password:"); // Метод showInputDialog() создает диалоговое окно,
        //отображает в нем текстовое поле и принимает с него текст, так же создает кнопки для подтверждения или ответа.


        if (
                username != null && password != null && // Инструкция проверяет, присвоено ли переменной username какое-либо значение.
                        (
                                (username.equals("bburd") && password.equals("swordfish")) ||
                        (username.equals ("hritter") && password.equals ("preakston"))
                )
                )
        {
            JOptionPane.showMessageDialog(null, "Вы допущены в систему!");
        } else {
            JOptionPane.showMessageDialog(null, "Попытайтесь еще раз...");
        }
    }
}

