package fr.xephi.authme.permission;

/**
 * Enum representing the permissions systems AuthMe supports.
 */
public enum PermissionsSystemType {

    /**
     * Permissions Ex.
     */
    PERMISSIONS_EX("PermissionsEx", "PermissionsEx"),

    /**
     * Permissions Bukkit.
     */
    PERMISSIONS_BUKKIT("Permissions Bukkit", "PermissionsBukkit"),

    /**
     * bPermissions.
     */
    B_PERMISSIONS("bPermissions", "bPermissions"),

    /**
     * Essentials Group Manager.
     */
    ESSENTIALS_GROUP_MANAGER("Essentials Group Manager", "GroupManager"),

    /**
     * zPermissions.
     */
    Z_PERMISSIONS("zPermissions", "zPermissions"),

    /**
     * Vault.
     */
    VAULT("Vault", "Vault");

    /**
     * The display name of the permissions system.
     */
    public String name;

    /**
     * The name of the permissions system plugin.
     */
    public String pluginName;

    /**
     * Constructor for PermissionsSystemType.
     *
     * @param name       Display name of the permissions system.
     * @param pluginName Name of the plugin.
     */
    PermissionsSystemType(String name, String pluginName) {
        this.name = name;
        this.pluginName = pluginName;
    }

    /**
     * Get the display name of the permissions system.
     *
     * @return Display name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the plugin name.
     *
     * @return Plugin name.
     */
    public String getPluginName() {
        return this.pluginName;
    }

    /**
     * Cast the permissions system type to a string.
     *
     * @return The display name of the permissions system.
     */
    @Override
    public String toString() {
        return getName();
    }

    /**
     * Check if a given plugin is a permissions system.
     *
     * @param name The name of the plugin to check.
     * @return If the plugin is a valid permissions system.
     */
    public static boolean isPermissionSystem(String name) {
        for (PermissionsSystemType permissionsSystemType : values()) {
            if (permissionsSystemType.pluginName.equals(name)) {
                return true;
            }
        }
        return false;
    }
}
