public class Main {
    public static void main(String[] args) {

        ApiContextInitializer.init();

        //Set up Http proxy
        DefaultBotOptions botOptions = ApiContext.getInstance(DefaultBotOptions.class);

        botOptions.setProxyType(DefaultBotOptions.ProxyType.SOCKS5);
        botOptions.setProxyHost("localhost");
        botOptions.setProxyPort(9150);

        MiFIN1_Bot MiFIN1_Bot = new MiFIN1_Bot(botOptions);
        TelegramBotsApi botsApi = new TelegramBotsApi();

        try {
            botsApi.registerBot(MiFIN1_Bot);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}