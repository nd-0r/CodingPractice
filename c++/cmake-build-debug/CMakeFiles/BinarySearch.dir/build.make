# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.19

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake

# The command to remove a file.
RM = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/andreworals/Documents/Dev/CodingPractice/c++

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/andreworals/Documents/Dev/CodingPractice/c++/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/BinarySearch.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/BinarySearch.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/BinarySearch.dir/flags.make

CMakeFiles/BinarySearch.dir/src/BinarySearch.cpp.o: CMakeFiles/BinarySearch.dir/flags.make
CMakeFiles/BinarySearch.dir/src/BinarySearch.cpp.o: ../src/BinarySearch.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/andreworals/Documents/Dev/CodingPractice/c++/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/BinarySearch.dir/src/BinarySearch.cpp.o"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/BinarySearch.dir/src/BinarySearch.cpp.o -c /Users/andreworals/Documents/Dev/CodingPractice/c++/src/BinarySearch.cpp

CMakeFiles/BinarySearch.dir/src/BinarySearch.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/BinarySearch.dir/src/BinarySearch.cpp.i"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/andreworals/Documents/Dev/CodingPractice/c++/src/BinarySearch.cpp > CMakeFiles/BinarySearch.dir/src/BinarySearch.cpp.i

CMakeFiles/BinarySearch.dir/src/BinarySearch.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/BinarySearch.dir/src/BinarySearch.cpp.s"
	/Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/andreworals/Documents/Dev/CodingPractice/c++/src/BinarySearch.cpp -o CMakeFiles/BinarySearch.dir/src/BinarySearch.cpp.s

# Object files for target BinarySearch
BinarySearch_OBJECTS = \
"CMakeFiles/BinarySearch.dir/src/BinarySearch.cpp.o"

# External object files for target BinarySearch
BinarySearch_EXTERNAL_OBJECTS =

../bin/BinarySearch: CMakeFiles/BinarySearch.dir/src/BinarySearch.cpp.o
../bin/BinarySearch: CMakeFiles/BinarySearch.dir/build.make
../bin/BinarySearch: CMakeFiles/BinarySearch.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/andreworals/Documents/Dev/CodingPractice/c++/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable ../bin/BinarySearch"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/BinarySearch.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/BinarySearch.dir/build: ../bin/BinarySearch

.PHONY : CMakeFiles/BinarySearch.dir/build

CMakeFiles/BinarySearch.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/BinarySearch.dir/cmake_clean.cmake
.PHONY : CMakeFiles/BinarySearch.dir/clean

CMakeFiles/BinarySearch.dir/depend:
	cd /Users/andreworals/Documents/Dev/CodingPractice/c++/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/andreworals/Documents/Dev/CodingPractice/c++ /Users/andreworals/Documents/Dev/CodingPractice/c++ /Users/andreworals/Documents/Dev/CodingPractice/c++/cmake-build-debug /Users/andreworals/Documents/Dev/CodingPractice/c++/cmake-build-debug /Users/andreworals/Documents/Dev/CodingPractice/c++/cmake-build-debug/CMakeFiles/BinarySearch.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/BinarySearch.dir/depend
