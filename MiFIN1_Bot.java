import static java.awt.SystemColor.text;

public class MiFIN1_Bot extends TelegramLongPollingBot {
    private static final  String TOKEN ="5698916525:AAFOGKWdoqhIs57g-Fg0kaey74k2tSFcW0g" ;
    private static final  String USERNAME = "MiFIN1_Bot";
    public  MiFIN1_Bot(DefaultBotOptions options) {super(options);}
    public String getBotToken(){return TOKEN;}
    public String getBotUsername(){return USERNAME;}
    public  void onUpdateReceived(Update update) {
        if(update.getMassage()!=null && update.getMessage().hasText()){
            long chat_id = update.getMessage().getChatId();
            try{
                execute(new SendMessage(chat_id, text :"Hello"+update.getMessage().getText()))
            }catch (TelegramApiException e){
                e.printStackTrace();
            }
        }
    }
}
