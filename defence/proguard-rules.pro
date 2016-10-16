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
-keep public class com.gamesneox.defence.Defence

# OPTIMIZE
-optimizationpasses 2

-optimizations !code/simplification/arithmetic,!code/simplification/cast,!field/*,!class/merging/*

# OBFUSCATE

# PREVERIFY
-dontpreverify
