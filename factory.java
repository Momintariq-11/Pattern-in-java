//Task 2: Factory — Notification Creator
//You need to send EmailNotification, SMSNotification, and PushNotification, all implementing a common Notification interface with a send() method.
//Build a NotificationFactory that takes a string like "EMAIL" or "SMS" and returns the correct object
//The calling code should never use new EmailNotification() directly, it only talks to the factory
//This is where you should notice DRY in action: object creation logic lives in one place instead of scattered everywhere
interface Notification {
    void send();
}
class EmailNotification  implements Notification {
    public void send() {
        System.out.println("Sending Email Notification");
    }
}
    class SMSNotification  implements Notification {
        public void send(){
            System.out.println("Sending SMS Notification");

        }
    }
    class PushNotification  implements Notification {
        public void send() {
            System.out.println("Sending Push Notification");
        }
    }
    class NotificationFactory {
        public static Notification getNotification(String type) {
            if (type == null) {
                return null;
            }
            if (type.equalsIgnoreCase("Email"))
            {
                return new EmailNotification();
            }
            if (type.equalsIgnoreCase("SMS"))
            {
                return new SMSNotification();
            }
            if (type.equalsIgnoreCase("Push")){
                return new PushNotification();
            }
            return null;
        }
    }
public class factory {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.getNotification("Email");
        notification.send();
        notification = NotificationFactory.getNotification("SMS");
        notification.send();
        notification = NotificationFactory.getNotification("Push");
        notification.send();
    }
}
