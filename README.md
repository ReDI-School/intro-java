![ReDI](redi_banner.png)

# Introduction to Java

This is the support project for the "Intro to Java" course at [ReDI School](https://www.redi-school.org).

The website is visible at:

  **https://redi-school.github.io/intro-java**

## Authoring the website

The website is built using [Jekyll](https://jekyllrb.com) and hosted automatically by GitHub Pages.
You cannot use a different generator, as Jekyll is the only one supported by GitHub Pages.

For details on how to author a static website using Jekyll, please see
the [Jekyll documentation](https://jekyllrb.com/docs).

## How to publish and update the course website

This website is built by GitHub Pages using Jekyll. This happens automatically
if GitHub Pages is configured in the following way:

- Go to the settings of the project
- Enable GitHub Pages
- Configure GitHub Pages to publish directly the `master` branch (not `master/docs` or `gh-pages`)
- Don't select a theme

Once these settings are applied to the project, every commit on `master` will trigger
a new build of the website that automatically replaces the older version
at the `github.io` URL above. The URL can't be changed.

## Building locally

To build and test the website, you must have a Ruby development environment with Bundler.

### Installing Ruby, Bundler, Jekyll

On Ubuntu LTS 20.04:

```bash
sudo apt install bundler ruby-dev zlib1g-dev
```

The last two packages are needed to compile some native Ruby dependencies (Ubuntu specific).
On MacOS and Windows, please follow the installation instructions of Ruby and Bundler
as suggested in the Jekyll [install guide](https://jekyllrb.com/docs/installation).

Once Ruby and Bundler are installed, use the following command to download the gems,
including the proper version of Jekyll (only once):

```bash
bundle install --path vendor/bundle
```

This creates the `.bundle` and `vendor` directories, that should *not* be committed to the git repository.

### Building and testing the website

To build, test and serve the website locally, please run:

```bash
bundle exec jekyll serve
```

You can then visit the website on [localhost:4000](http://localhost:4000).

## About the ReDI theme

Note this website uses a version of a well-known Jekyll theme, customized with ReDI colors and logos.
This theme is also hosted on GitHub, in the ReDI account.

The theme is available at:

  https://github.com/ReDI-School/jekyll-theme-redischool

This course website uses the latest version of `redi-customizations` branch of the theme repository.

You can update, from time to time, the jekyll theme, pulling from the master
branch of the upstream and merging the new master into the `redi-customizations` branch.
Make sure this and other course websites still build with the updated theme.

**If you break the theme, every other course website of ReDI School will break
once a new commit is pushed to their repositories, so handle the theme carefully.**

Please see the README_REDI.md file in the `redi-customizations` branch for more info.
