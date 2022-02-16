package net.gcnt.skywarsreloaded.data.player;

/**
 * Stats and player cosmetics for a currently connected player
 */
public class CoreSWPlayerData implements SWPlayerData {

    private boolean initialized;

    private int solo_wins;
    private int solo_kills;
    private int solo_games;
    private int team_wins;
    private int team_kills;
    private int team_games;
    private String selected_solo_cage;
    private String selected_team_cage;
    private String selected_particle;
    private String selected_kill_effect;
    private String selected_win_effect;
    private String selected_projectile_effect;
    private String kill_messages_theme;

    public CoreSWPlayerData() {
        this.initialized = false;
    }

    @Override
    public boolean isInitialized() {
        return initialized;
    }

    @Override
    public void initData(int soloWinsIn,
                         int soloKillsIn,
                         int soloGamesIn,
                         int teamWinsIn,
                         int teamKillsIn,
                         int teamGamesIn,
                         String selectedSoloCageIn,
                         String selectedTeamCageIn,
                         String selectedParticleIn,
                         String selectedKillEffectIn,
                         String selectedWinEffectIn,
                         String selectedProjectileEffectIn,
                         String killMessagesThemeIn) {
        this.soloWins = soloWinsIn;
        this.soloKills = soloKillsIn;
        this.soloGames = soloGamesIn;
        this.teamWins = teamWinsIn;
        this.teamKills = teamKillsIn;
        this.teamGames = teamGamesIn;
        this.selectedSoloCage = selectedSoloCageIn;
        this.selectedTeamCage = selectedTeamCageIn;
        this.selectedParticle = selectedParticleIn;
        this.selectedKillEffect = selectedKillEffectIn;
        this.selectedWinEffect = selectedWinEffectIn;
        this.selectedProjectileEffect = selectedProjectileEffectIn;
        this.killMessagesTheme = killMessagesThemeIn;
    }

    @Override
    public int getSoloWins() {
        return solo_wins;
    }

    @Override
    public void setSoloWins(int amount) {
        solo_wins = amount;
    }

    @Override
    public int getSoloKills() {
        return solo_kills;
    }

    @Override
    public void setSoloKills(int amount) {
        solo_kills = amount;
    }

    @Override
    public int getSoloGamesPlayed() {
        return solo_games;
    }

    @Override
    public void setSoloGamesPlayed(int amount) {
        solo_games = amount;
    }

    @Override
    public int getTeamWins() {
        return team_wins;
    }

    @Override
    public void setTeamWins(int amount) {
        team_wins = amount;
    }

    @Override
    public int getTeamKills() {
        return team_kills;
    }

    @Override
    public void setTeamKills(int amount) {
        team_kills = amount;
    }

    @Override
    public int getTeamGamesPlayed() {
        return team_games;
    }

    @Override
    public void setTeamGamesPlayed(int amount) {
        team_games = amount;
    }

    @Override
    public String getSoloCage() {
        return selected_solo_cage;
    }

    @Override
    public void setSoloCage(String value) {
        selected_solo_cage = value;
    }

    @Override
    public String getTeamCage() {
        return selected_team_cage;
    }

    @Override
    public void setTeamCage(String value) {
        selected_team_cage = value;
    }

    @Override
    public String getParticle() {
        return selected_particle;
    }

    @Override
    public void setParticle(String value) {
        selected_particle = value;
    }

    @Override
    public String getKillEffect() {
        return selected_kill_effect;
    }

    @Override
    public void setKillEffect(String value) {
        selected_kill_effect = value;
    }

    @Override
    public String getWinEffect() {
        return selected_win_effect;
    }

    @Override
    public void setWinEffect(String value) {
        selected_win_effect = value;
    }

    @Override
    public String getProjectileParticle() {
        return selected_projectile_effect;
    }

    @Override
    public void setProjectileParticle(String value) {
        selected_projectile_effect = value;
    }

    @Override
    public String getKillMessagesTheme() {
        return kill_messages_theme;
    }

    @Override
    public void setKillMessagesTheme(String value) {
        kill_messages_theme = value;
    }
}
