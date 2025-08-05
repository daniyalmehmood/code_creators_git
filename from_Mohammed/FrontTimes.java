public class FrontTimes{
public String frontTimes(String str, int n) {

    int frontl =3;
    if (frontl>str.length())
        frontl=str.length();
    String front = str.substring(0, frontl);
    String res = "";
    for(int i=0;i<n;i++)
        res +=front;
    return res ;}}
