public enum StudyProfile {
    PROGRAMMING("Программирование"),
    JURISPRUDENCE("Юриспруденция"),
    HISTORY("История");

    String profileName;

    private StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}
