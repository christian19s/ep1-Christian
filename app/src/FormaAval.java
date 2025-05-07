public class FormaAval {
	private float mediaF1, mediaF2;

	public float calculaMF1(float P1, float P2, float P3, float L, float S) {
		mediaF1 = (P1 + P2 + P3 + L + S) / 5;
		return mediaF1;
	}

	public float calculaMF2(float P1, float P2, float P3, float L, float S) {
		mediaF2 = (P1 + P2 * 2 + P3 * 3 + L + S) / 8;
		return mediaF2;
	}
}
