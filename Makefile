ifeq ($(OS), Windows_NT)
src_file := ".\src\Learn.scala"
script_file := pause
clear_cmd := cls
else
src_file := "./src/Learn.scala"
script_file := "./scripts/pause.sh"
clear_cmd := "clear"
all: all
chmod:
	chmod +x ./scripts/pause.sh
endif
all:
	scala $(src_file)
	$(script_file) 
	$(clear_cmd)
.PHONY: all
