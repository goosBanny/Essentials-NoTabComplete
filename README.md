# Fork Changes:
## Origin
- Removed godmode.
- (Hardcoded) TabCompleter whitelist for home and warp commands. All other tabcompletors are off.
- TabCompleter might not be compatible with all Vanish systems.
- Vanish is probably broken. You should be using AdvancedVanish anyway.
- Disabled invsee.
- Disabled socialspy.
- Disabled a lot of events including interact, damage etc.
- God knows what else!

## New Config Options:
(Insert manually)
```yaml
# Tab Completion is disabled on all commands in EssX by default. You can enable it below.
# Leave empty to disable it globally. Aliases are covered automagically.
tab-completable-commands: ["warp", "sethome", "home", "renamehome", "delhome", "kit"]
```

---
## Upstream
- FreshSMP Essentials Fork (async-move branch.)
- Doesn't change plugin functionality.
