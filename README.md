# LaunchTool
LaunchTool aims to provide a cross-platform interface for managing the storage,
launch, and instancing of Minecraft installations.

## Project Motivation
My company does a lot of work around Minecraft, and we needed a proper method of
managing game instances. One of our talented associates maintains [LaunchKit][LK_GitHub].
LaunchKit is an amazing piece of software, and is currently being rewritten
using Dart. However, we need something compatible with both Node and Java that
also works standalone, so I'm writing this as a solution to that problem, since
the LaunchKit maintainer doesn't want to publish a Node package.

## Planned Features
- [ ] Symlink instances, mods, shaders, etc.
- [ ] Multiple Accounts, assignable per instance.
- [ ] Storage efficient MC version management.
- [ ] Standalone commandline application OoTB.

## License
This library is licensed under the [MIT License](LICENSE).

[LK_GitHub]: https://github.com/cyberpwnn/launchkit