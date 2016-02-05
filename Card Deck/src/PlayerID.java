
public class PlayerID
{
	String		id;
	int			idk;

	static int	globalid	= 0;

	public PlayerID() {
		idk = globalid;
		globalid++;
	}

	@Override
	public int hashCode()
	{
		return idk;
	}
}