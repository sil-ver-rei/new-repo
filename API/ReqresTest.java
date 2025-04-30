package API;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class ReqresTest {
    public final static String URL = "https://reqres.in";

    @Test
    public void checkAvatarAndIdTest(){

        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecError400());

        List<UserData> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL+"/api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
//        users.forEach(x-> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
//
//        Assert.assertTrue(users.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));

        List<String> avatars = users.stream().map(UserData::getAvatar).collect(Collectors.toUnmodifiableList());
        List<String> id = users.stream().map(x->x.getId().toString()).collect(Collectors.toList());

        for (int i = 0; i<avatars.size(); i++){
            Assert.assertTrue(avatars.get(i).contains(id.get(i)));
        }


    }
}
