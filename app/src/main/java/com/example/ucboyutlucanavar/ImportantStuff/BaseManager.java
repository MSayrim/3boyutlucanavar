package com.example.ucboyutlucanavar.ImportantStuff;

public class BaseManager {
    protected RestApi getRestApiClient()
    {
        RestApiClient restApiClient = new RestApiClient ( BaseUrl.model_Url );
        return restApiClient.getRestApi ();
    }
}
