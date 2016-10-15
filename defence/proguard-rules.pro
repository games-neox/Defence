#
# Copyright (c) 2016 Games Neox. All rights reserved.
#
# This file is an original work developed by Games Neox
#
# @author Games Neox (games.neox@gmail.com)
#

# GENERAL
-verbose

# SHRINK

# OPTIMIZE

-assumenosideeffects class com.gamesneox.defence.Defence {
    public static void assertNotNull(...);
    public static void assertCondition(...);
}

-optimizationpasses 2

-optimizations !code/simplification/arithmetic,!code/simplification/cast,!field/*,!class/merging/*

# OBFUSCATE

# PREVERIFY
-dontpreverify
