public class Utilisateur {
	public Utilisateur (int id, String nom, String prenom, String adresse, String datenaissance, String sexe, String age) {
		
		this.mId =id;
		this.mNom =nom;
		this.mPrenom =prenom;
		this.mAdresse =adresse;
		this.mDateNaissance =datenaissance;
		this.mSexe =sexe;
		this.mAge =age;
		
		System.out.println(this.mId+ "-" +this.mNom+ "," +this.mPrenom+ "," +this.mAdresse+ "," +this.mDateNaissance+ ","
				+this.mSexe+ "," +this.mAge);
		
		
		
		
	}
	private int mId;
	private String mNom;
	private String mPrenom;
	private String mAdresse;
	private String mDateNaissance;
	private String mSexe;
	private String mAge;

}