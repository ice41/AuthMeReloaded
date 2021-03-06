package fr.xephi.authme.permission;

/**
 * Permission nodes that give a player a status (e.g. VIP)
 * or grant them more freedom (e.g. less restrictions).
 */
public enum PlayerStatePermission implements PermissionNode {

    /**
     * Permission node to bypass AntiBot protection.
     */
    BYPASS_ANTIBOT("authme.bypassantibot", DefaultPermission.OP_ONLY),

    /**
     * Permission for users to bypass force-survival mode.
     */
    BYPASS_FORCE_SURVIVAL("authme.bypassforcesurvival", DefaultPermission.OP_ONLY),

    /**
     * Permission node to identify VIP users.
     */
    IS_VIP("authme.vip", DefaultPermission.OP_ONLY),

    /**
     * Permission to be able to register multiple accounts.
     */
    ALLOW_MULTIPLE_ACCOUNTS("authme.allowmultipleaccounts", DefaultPermission.OP_ONLY);

    /**
     * The permission node.
     */
    private String node;

    /**
     * The default permission level
     */
    private DefaultPermission defaultPermission;

    /**
     * Constructor.
     *
     * @param node Permission node.
     */
    PlayerStatePermission(String node, DefaultPermission defaultPermission) {
        this.node = node;
        this.defaultPermission = defaultPermission;
    }

    @Override
    public String getNode() {
        return node;
    }

    @Override
    public DefaultPermission getDefaultPermission() {
        return defaultPermission;
    }
}
