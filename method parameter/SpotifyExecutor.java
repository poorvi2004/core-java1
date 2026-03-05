class SpotifyExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Spotify");

		Spotify.createAccount("MusicLover","music@gmail.com",9011111111l,"Music@123","Premium","India","English");
		Spotify.createAccount("RockStar","rock@gmail.com",9022222222l,"Rock@123","Free","USA","English");
		Spotify.createAccount("Melody","melody@gmail.com",9033333333l,"Melody@123","Premium","UK","English");
		Spotify.createAccount("DJMax","dj@gmail.com",9044444444l,"DJ@123","Family","Canada","French");
		Spotify.createAccount("BeatBox","beat@gmail.com",9055555555l,"Beat@123","Premium","India","Hindi");
	}
}