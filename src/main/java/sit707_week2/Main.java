package sit707_week2;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args )
    {
        SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
        
        SeleniumOperations.target_registration_page("https://auth.target.com.au/login?state=hKFo2SBKMTNTZWJQODNNM1BmenRVdG5UQ1hVOHZtMGNtZmVOaqFupWxvZ2luo3RpZNkgV1hOZXFiYXpnLU1peUtaNEpXOUs2a1dFLVIyWkxPRDOjY2lk2SBYajVuQ1dsaEdiMHJGcFhuazh0VWVRZDVYS01NdjZUVA&client=Xj5nCWlhGb0rFpXnk8tUeQd5XKMMv6TT&protocol=oauth2&redirect_uri=https%3A%2F%2Fwww.target.com.au%2Fauth%2Fcallback&audience=https%3A%2F%2Ftarget.com.au%2Fapi&scope=openid%20email%20offline_access&response_type=code&signup=true");

    }
}
