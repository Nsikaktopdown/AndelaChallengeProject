package ng.codeimpact.andelachallengeproject.service;

import ng.codeimpact.andelachallengeproject.model.UserList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Nsikak  Thompson on 3/11/2017.
 */

public interface RestApiService {

    @GET("/search/users")
    Call<UserList> getUserList(@Query("q") String filter);

}
